package com.study.chatroom.common.websocket.domain.vo.resp;

public class WSBaseResp<T> {
    /**
     * @see com.study.chatroom.common.websocket.domain.enums.WSRespTypeEnum
     */
    private Integer type;
    private T data;
}
