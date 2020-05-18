<?php
// GENERATED CODE -- DO NOT EDIT!

namespace FaceRecognition;

/**
 */
class FaceSetServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * NewFaceSet创建一个FaceSet
     * @param \FaceRecognition\NewFaceSetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NewFaceSet(\FaceRecognition\NewFaceSetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/NewFaceSet',
        $argument,
        ['\FaceRecognition\NewFaceSetResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * DeleteFaceSet删除一个FaceSet
     * @param \FaceRecognition\DeleteFaceSetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteFaceSet(\FaceRecognition\DeleteFaceSetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/DeleteFaceSet',
        $argument,
        ['\FaceRecognition\DeleteFaceSetResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * UpdateFaceSet更新一个FaceSet基础信息
     * @param \FaceRecognition\UpdateFaceSetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateFaceSet(\FaceRecognition\UpdateFaceSetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/UpdateFaceSet',
        $argument,
        ['\FaceRecognition\UpdateFaceSetResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * ListFaceSets列举所有FaceSets
     * @param \FaceRecognition\ListFaceSetsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListFaceSets(\FaceRecognition\ListFaceSetsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/ListFaceSets',
        $argument,
        ['\FaceRecognition\ListFaceSetsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
     * @param \FaceRecognition\AddFaceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function AddFace(\FaceRecognition\AddFaceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/AddFace',
        $argument,
        ['\FaceRecognition\AddFaceResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * RemoveFace将从FaceSet中移除对应FaceToken
     * @param \FaceRecognition\RemoveFaceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function RemoveFace(\FaceRecognition\RemoveFaceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/RemoveFace',
        $argument,
        ['\FaceRecognition\RemoveFaceResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * FaceDetail通过face_token获取对应的FaceDetail
     * @param \FaceRecognition\FaceDetailRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function FaceDetail(\FaceRecognition\FaceDetailRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/FaceDetail',
        $argument,
        ['\FaceRecognition\FaceDetailResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * ListFaceDetails返回指定FaceSet中的FaceDetails
     * @param \FaceRecognition\ListFaceDetailsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListFaceDetails(\FaceRecognition\ListFaceDetailsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/faceRecognition.FaceSetService/ListFaceDetails',
        $argument,
        ['\FaceRecognition\ListFaceDetailsResponse', 'decode'],
        $metadata, $options);
    }

}
