package com.kip.backtothepast.server.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kip
 */
public abstract class BaseController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public BaseController() {
    }

    protected ResultEntity resultInfo(Integer code, String message, Object data) {
        ResultEntity retInfo = new ResultEntity();
        retInfo.setCode(code);
        retInfo.setMessage(message);
        retInfo.setData(data);
        return retInfo;
    }

    protected ResultEntity success(Object data) {
        ResultEntity retInfo = new ResultEntity();
        retInfo.setCode(0);
        retInfo.setMessage("操作成功");
        retInfo.setData(data);
        return retInfo;
    }

    protected ResultEntity failed(Integer code, String message) {
        ResultEntity retInfo = new ResultEntity();
        retInfo.setCode(code);
        retInfo.setMessage(message);
        return retInfo;
    }

}
