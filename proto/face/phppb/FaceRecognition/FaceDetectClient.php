<?php
// GENERATED CODE -- DO NOT EDIT!

namespace FaceRecognition;

/**
 */
class FaceDetectClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
     * @param \FaceRecognition\FromImageRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function FromImage(\FaceRecognition\FromImageRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceDetect/FromImage',
        $argument,
        ['\FaceRecognition\FromImageResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
     * @param \FaceRecognition\OnFaceDetectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function OnFaceDetect(\FaceRecognition\OnFaceDetectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/faceRecognition.FaceDetect/OnFaceDetect',
        $argument,
        ['\FaceRecognition\OnFaceDetectResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
     * @param \FaceRecognition\OnFaceSetFaceDetectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function OnFaceSetFaceDetect(\FaceRecognition\OnFaceSetFaceDetectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/faceRecognition.FaceDetect/OnFaceSetFaceDetect',
        $argument,
        ['\FaceRecognition\OnFaceSetFaceDetectResponse', 'decode'],
        $metadata, $options);
    }

}
