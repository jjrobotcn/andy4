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
     * 获取监控数据日期列表
     * @param \CameraService\DvrListDatesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DvrListDates(\CameraService\DvrListDatesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/cameraService.CameraService/DvrListDates',
        $argument,
        ['\CameraService\DvrListDatesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取监控数据指定日期视频文件列表
     * @param \CameraService\DvrListDateVideosRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DvrListDateVideos(\CameraService\DvrListDateVideosRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/cameraService.CameraService/DvrListDateVideos',
        $argument,
        ['\CameraService\DvrListDateVideosResponse', 'decode'],
        $metadata, $options);
    }

}
