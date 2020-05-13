<?php
// GENERATED CODE -- DO NOT EDIT!

namespace FaceRecognition;

/**
 */
class FaceServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
     * @param \FaceRecognition\CompareRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Compare(\FaceRecognition\CompareRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceService/Compare',
        $argument,
        ['\FaceRecognition\CompareResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Search方法实现搜索FaceSet中近似人脸数据，
     * 若存在匹配数据时返回一个FaceDetail及其confidence
     * @param \FaceRecognition\SearchRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Search(\FaceRecognition\SearchRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceService/Search',
        $argument,
        ['\FaceRecognition\SearchResponse', 'decode'],
        $metadata, $options);
    }

}
