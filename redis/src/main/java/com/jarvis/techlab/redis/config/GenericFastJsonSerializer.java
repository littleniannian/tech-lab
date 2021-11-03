package com.jarvis.techlab.redis.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName GenericFastJsonSerializer.java
 * @createTime 2021年11月03日 15:56:00
 */
public class GenericFastJsonSerializer implements RedisSerializer<Object> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if(Objects.isNull(o)){
            return new byte[0];
        }
        try {
            return objectMapper.writeValueAsBytes(o);
        } catch (JsonProcessingException e) {
            throw new SerializationException("Can not serialize: "+e.getMessage());
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if(bytes == null || bytes.length == 0){
            return null;
        }
        try {
            return objectMapper.readValue(new String(bytes, StandardCharsets.UTF_8),Object.class);
        } catch (Exception e) {
            throw new SerializationException("Could not deserialize: "+e.getMessage());
        }
    }
}
