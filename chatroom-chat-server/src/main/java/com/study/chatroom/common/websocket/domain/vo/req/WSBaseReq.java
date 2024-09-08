package com.study.chatroom.common.websocket.domain.vo.req;

import lombok.Data;

@Data
public class WSBaseReq {
    /**
     * @see com.study.chatroom.common.websocket.domain.enums.WSReqTypeEnum
     */
    private Integer type;
    private String data;
}
