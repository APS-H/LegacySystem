package com.apsh.legacy.util;

import java.io.File;

public class SchemaUtil {

    private static final String schemaPath = "/run/schemas";

    public static File loadSchema(String file) {
        return new File(schemaPath, file);
    }

}
