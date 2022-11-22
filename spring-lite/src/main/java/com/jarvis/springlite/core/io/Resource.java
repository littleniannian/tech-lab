package com.jarvis.springlite.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源处理接口
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
