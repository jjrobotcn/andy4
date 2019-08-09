<?php
// GENERATED CODE -- DO NOT EDIT!

namespace LightsService;

/**
 */
class LightsServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 预览灯光
     * 创建灯光后使用此方法生成灯光文件
     * 在未生成灯光文件前调用PlayLight将无效
     * @param \LightsService\PreviewLightRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PreviewLight(\LightsService\PreviewLightRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lightsService.LightsService/PreviewLight',
        $argument,
        ['\LightsService\PreviewLightResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 播放灯光
     * 需在播放前执行PreviewLight生成灯光文件
     * @param \LightsService\PlayLightRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PlayLight(\LightsService\PlayLightRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lightsService.LightsService/PlayLight',
        $argument,
        ['\LightsService\PlayLightResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 停止灯光
     * @param \LightsService\StopLightRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function StopLight(\LightsService\StopLightRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lightsService.LightsService/StopLight',
        $argument,
        ['\LightsService\StopLightResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取灯光数据
     * @param \LightsService\ListLightsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListLights(\LightsService\ListLightsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lightsService.LightsService/ListLights',
        $argument,
        ['\LightsService\ListLightsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 创建灯光
     * @param \LightsService\NewLightRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NewLight(\LightsService\NewLightRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lightsService.LightsService/NewLight',
        $argument,
        ['\LightsService\NewLightResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 更新灯光数据
     * @param \LightsService\UpdateLightRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateLight(\LightsService\UpdateLightRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lightsService.LightsService/UpdateLight',
        $argument,
        ['\LightsService\UpdateLightResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 删除灯光
     * @param \LightsService\DeleteLightsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteLights(\LightsService\DeleteLightsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lightsService.LightsService/DeleteLights',
        $argument,
        ['\LightsService\DeleteLightsResponse', 'decode'],
        $metadata, $options);
    }

}
