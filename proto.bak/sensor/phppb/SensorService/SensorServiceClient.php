<?php
// GENERATED CODE -- DO NOT EDIT!

namespace SensorService;

/**
 */
class SensorServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 获取感应数据流
     * @param \SensorService\GetDetectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetDetect(\SensorService\GetDetectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/sensorService.SensorService/GetDetect',
        $argument,
        ['\SensorService\GetDetectResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取动态感应数据
     * 场景示例： 迎宾感应
     * @param \SensorService\GetMotionInductionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetMotionInduction(\SensorService\GetMotionInductionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/sensorService.SensorService/GetMotionInduction',
        $argument,
        ['\SensorService\GetMotionInductionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取触摸数据流
     * @param \SensorService\GetTouchRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetTouch(\SensorService\GetTouchRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/sensorService.SensorService/GetTouch',
        $argument,
        ['\SensorService\GetTouchResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取传感器原始数据调试接口
     * @param \SensorService\RawRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Raw(\SensorService\RawRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/sensorService.SensorService/Raw',
        $argument,
        ['\SensorService\RawResponse', 'decode'],
        $metadata, $options);
    }

}
