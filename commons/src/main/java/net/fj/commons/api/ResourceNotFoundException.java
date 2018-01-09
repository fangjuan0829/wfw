package net.fj.commons.api;

/**
 * wfw Project
 * net.fj.commons.api
 * 2017-12-28-15:01
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */
/**
 * @Author:fannyfang
 * @Description:资源未找到异常
 * @Date:15:01 2017-12-28
 */
public class ResourceNotFoundException extends RuntimeException {

    private Long resourceId;

    public ResourceNotFoundException(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getResourceId() {
        return this.resourceId;
    }

}
