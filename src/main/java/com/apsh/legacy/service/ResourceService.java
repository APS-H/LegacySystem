package com.apsh.legacy.service;

import com.apsh.legacy.data.ResourceData;
import com.apsh.legacy.entity.Resource;
import com.apsh.legacy.entity.Resources;
import com.apsh.legacy.util.Transformer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ResourceService {

    private final ResourceData resourceData;

    public ResourceService() {
        this.resourceData = new ResourceData();
    }

    @WebMethod
    public String getResourceService() throws Exception {
        List<Resource> res = resourceData.getResources();
        Resources rs = new Resources(res);
        Transformer<Resources> jtx = new Transformer<>();
        return jtx.java2Xml(rs);

    }

}
