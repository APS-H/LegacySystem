package com.apsh.legacy.util;

import org.springframework.beans.factory.annotation.Value;

import java.io.File;

public class SchemaUtil {

    @Value("${schema.path}")
    private static String schemaPath;

    public static File loadSchema(String file) {
        return new File(schemaPath, file);
    }

}
