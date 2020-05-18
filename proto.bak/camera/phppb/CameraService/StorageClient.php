<?php
// GENERATED CODE -- DO NOT EDIT!

namespace CameraService;

/**
 */
class StorageClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 获取监控视频日期列表
     * @param \CameraService\ListDatesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListDates(\CameraService\ListDatesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/cameraService.Storage/ListDates',
        $argument,
        ['\CameraService\ListDatesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取监控视频列表
     * @param \CameraService\ListVideosRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListVideos(\CameraService\ListVideosRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/cameraService.Storage/ListVideos',
        $argument,
        ['\CameraService\ListVideosResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取监控视频文件
     * @param \CameraService\GetVideoFileRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetVideoFile(\CameraService\GetVideoFileRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/cameraService.Storage/GetVideoFile',
        $argument,
        ['\CameraService\GetVideoFileResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 删除监控视频文件
     * @param \CameraService\DeleteVideoFilesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteVideoFiles(\CameraService\DeleteVideoFilesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/cameraService.Storage/DeleteVideoFiles',
        $argument,
        ['\CameraService\DeleteVideoFilesResponse', 'decode'],
        $metadata, $options);
    }

}
