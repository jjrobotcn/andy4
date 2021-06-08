<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Handsmotion;

/**
 */
class CapabilityClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 手指调整方法
     * 调整手指动作的开合与重置
     * @param \Handsmotion\FingersAdjustmentRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function FingersAdjustment(\Handsmotion\FingersAdjustmentRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Capability/FingersAdjustment',
        $argument,
        ['\Handsmotion\FingersAdjustmentResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 手臂调整方法
     * 调整手臂位置重置、使能与失能。
     * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * @param \Handsmotion\ArmAdjustmentRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ArmAdjustment(\Handsmotion\ArmAdjustmentRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Capability/ArmAdjustment',
        $argument,
        ['\Handsmotion\ArmAdjustmentResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 标记当前位置为初始位置
     * 所有位置数据将基于此点进行计算
     * @param \Handsmotion\MarkAsOriginalPositionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function MarkAsOriginalPosition(\Handsmotion\MarkAsOriginalPositionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Capability/MarkAsOriginalPosition',
        $argument,
        ['\Handsmotion\MarkAsOriginalPositionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取当前绝对位置
     * @param \Handsmotion\GetAbsolutePositionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetAbsolutePosition(\Handsmotion\GetAbsolutePositionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Capability/GetAbsolutePosition',
        $argument,
        ['\Handsmotion\GetAbsolutePositionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 绝对位置移动
     * @param \Handsmotion\AbsoluteMoveRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function AbsoluteMove(\Handsmotion\AbsoluteMoveRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Capability/AbsoluteMove',
        $argument,
        ['\Handsmotion\AbsoluteMoveResponse', 'decode'],
        $metadata, $options);
    }

}
