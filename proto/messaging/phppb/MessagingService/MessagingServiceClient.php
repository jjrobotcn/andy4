<?php
// GENERATED CODE -- DO NOT EDIT!

namespace MessagingService;

/**
 * MessagingService消息服务便于开发者在不同设备或应用中实现消息通信广播
 */
class MessagingServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Messaging为消息发布订阅方法
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Messaging($metadata = [], $options = []) {
        return $this->_bidiRequest('/messagingService.MessagingService/Messaging',
        ['\MessagingService\MessagingResponse','decode'],
        $metadata, $options);
    }

}
