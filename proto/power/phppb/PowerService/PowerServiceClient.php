<?php
// GENERATED CODE -- DO NOT EDIT!

namespace PowerService;

/**
 */
class PowerServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 获取电源状态数据流
     * @param \PowerService\GetPowerStatusRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetPowerStatus(\PowerService\GetPowerStatusRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/powerService.PowerService/GetPowerStatus',
        $argument,
        ['\PowerService\GetPowerStatusResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 对各模块的电源进行断电方式重启
     * @param \PowerService\RebootRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Reboot(\PowerService\RebootRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/powerService.PowerService/Reboot',
        $argument,
        ['\PowerService\RebootResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取所有电源模块状态
     * @param \PowerService\StatesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function States(\PowerService\StatesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/powerService.PowerService/States',
        $argument,
        ['\PowerService\StatesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 控制模块供电开关
     * @param \PowerService\SwitchRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Switch(\PowerService\SwitchRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/powerService.PowerService/Switch',
        $argument,
        ['\PowerService\SwitchResponse', 'decode'],
        $metadata, $options);
    }

}
