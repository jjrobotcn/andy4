<?php
// GENERATED CODE -- DO NOT EDIT!

namespace IdCardService;

/**
 */
class IDCardServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 获取读卡数据流
     * @param \IdCardService\GetIdInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetIdInfo(\IdCardService\GetIdInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/idCardService.IDCardService/GetIdInfo',
        $argument,
        ['\IdCardService\GetIdInfoResponse', 'decode'],
        $metadata, $options);
    }

}
