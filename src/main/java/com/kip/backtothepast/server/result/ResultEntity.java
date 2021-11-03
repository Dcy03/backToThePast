package com.kip.backtothepast.server.result;

import lombok.Data;

/**
 * @author Kip
 */
@Data
public class ResultEntity {

    protected Integer code;
    protected String message;
    protected Object data;
}
