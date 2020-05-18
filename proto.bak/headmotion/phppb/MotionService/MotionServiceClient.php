<?php
// GENERATED CODE -- DO NOT EDIT!

namespace MotionService;

/**
 */
class MotionServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 移动功能
     * @param \MotionService\MoveToRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function MoveTo(\MotionService\MoveToRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/MoveTo',
        $argument,
        ['\MotionService\MoveToResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 持续监听位置消息
     * @param \MotionService\PositioningDataRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PositioningData(\MotionService\PositioningDataRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/motionService.MotionService/PositioningData',
        $argument,
        ['\MotionService\PositioningDataResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取当前位置信息
     * @param \MotionService\GetPositionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetPosition(\MotionService\GetPositionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/GetPosition',
        $argument,
        ['\MotionService\GetPositionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 创建组
     * @param \MotionService\NewGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NewGroup(\MotionService\NewGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/NewGroup',
        $argument,
        ['\MotionService\NewGroupResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取组列表
     * @param \MotionService\ListGroupsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListGroups(\MotionService\ListGroupsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/ListGroups',
        $argument,
        ['\MotionService\ListGroupsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 更新组信息
     * @param \MotionService\UpdateGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateGroup(\MotionService\UpdateGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/UpdateGroup',
        $argument,
        ['\MotionService\UpdateGroupResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 删除组列表
     * @param \MotionService\DeleteGroupsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteGroups(\MotionService\DeleteGroupsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/DeleteGroups',
        $argument,
        ['\MotionService\DeleteGroupsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取组动作点列表
     * @param \MotionService\ListGroupTargetsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListGroupTargets(\MotionService\ListGroupTargetsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/ListGroupTargets',
        $argument,
        ['\MotionService\ListGroupTargetsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 更新组动作点列表
     * @param \MotionService\UpdateGroupTargetsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateGroupTargets(\MotionService\UpdateGroupTargetsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/motionService.MotionService/UpdateGroupTargets',
        $argument,
        ['\MotionService\UpdateGroupTargetsResponse', 'decode'],
        $metadata, $options);
    }

}
