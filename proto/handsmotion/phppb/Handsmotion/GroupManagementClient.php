<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Handsmotion;

/**
 */
class GroupManagementClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 新建动作分组
     * @param \Handsmotion\NewMotionGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NewMotionGroup(\Handsmotion\NewMotionGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.GroupManagement/NewMotionGroup',
        $argument,
        ['\Handsmotion\NewMotionGroupResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取所有动作分组列表
     * @param \Handsmotion\ListMotionGroupsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListMotionGroups(\Handsmotion\ListMotionGroupsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.GroupManagement/ListMotionGroups',
        $argument,
        ['\Handsmotion\ListMotionGroupsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 删除动作分组
     * @param \Handsmotion\DeleteMotionGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteMotionGroup(\Handsmotion\DeleteMotionGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.GroupManagement/DeleteMotionGroup',
        $argument,
        ['\Handsmotion\DeleteMotionGroupResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取动作分组
     * @param \Handsmotion\GetMotionGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetMotionGroup(\Handsmotion\GetMotionGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.GroupManagement/GetMotionGroup',
        $argument,
        ['\Handsmotion\GetMotionGroupResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 更新动作分组Meta
     * @param \Handsmotion\UpdateMotionMetaRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateMotionGroupMeta(\Handsmotion\UpdateMotionMetaRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.GroupManagement/UpdateMotionGroupMeta',
        $argument,
        ['\Handsmotion\UpdateMotionMetaResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 更新动作分组Scripts
     * @param \Handsmotion\UpdateMotionScriptsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateMotionGroupScripts(\Handsmotion\UpdateMotionScriptsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.GroupManagement/UpdateMotionGroupScripts',
        $argument,
        ['\Handsmotion\UpdateMotionScriptsResponse', 'decode'],
        $metadata, $options);
    }

}
