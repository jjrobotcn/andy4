<?php
// GENERATED CODE -- DO NOT EDIT!

namespace NavService;

/**
 */
class MapClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \NavService\GetMapInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetMapInfo(\NavService\GetMapInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.Map/GetMapInfo',
        $argument,
        ['\NavService\GetMapInfoResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \NavService\MapPositionStreamRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function MapPositionStream(\NavService\MapPositionStreamRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/navService.Map/MapPositionStream',
        $argument,
        ['\NavService\MapPositionStreamResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 重置当前定位
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * @param \NavService\LocationResetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function LocationReset(\NavService\LocationResetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.Map/LocationReset',
        $argument,
        ['\NavService\LocationResetResponse', 'decode'],
        $metadata, $options);
    }

}
