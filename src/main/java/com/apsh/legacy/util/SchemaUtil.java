package com.apsh.legacy.util;

import java.io.File;

public class SchemaUtil {

    private static final String schemaPath = "/Users/peihongchen/Documents/面向互联网+的软件开发技术方向综合实践/APS-H/LegacySystem/schema";

    public static File loadSchema(String file) {
        return new File(schemaPath, file);
    }

}
