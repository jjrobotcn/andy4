<?php
// GENERATED CODE -- DO NOT EDIT!

namespace CameraService;

/**
 */
class CameraServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 直播流数据, 数据为h264 nal单元
     * @param \CameraService\LiveH264StreamRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function LiveH264Stream(\CameraService\LiveH264StreamRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/cameraService.CameraService/LiveH264Stream',
        $argument,
        ['\CameraService\LiveH264StreamResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取当前最新图片jpg
     * 图片更新时间周期为1s
     * @param \CameraService\LatestImageRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function LatestImage(\CameraService\LatestImageRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/cameraService.CameraService/LatestImage',
        $argument,
        ['\CameraService\LatestImageResponse', 'decode'],
        $metadata, $options);
    }

}
