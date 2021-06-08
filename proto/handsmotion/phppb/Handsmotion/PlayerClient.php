<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Handsmotion;

/**
 */
class PlayerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Play 播放手臂动作
     * @param \Handsmotion\PlayRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Play(\Handsmotion\PlayRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Player/Play',
        $argument,
        ['\Handsmotion\PlayResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Stop 停止手臂动作
     * @param \Handsmotion\StopRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Stop(\Handsmotion\StopRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Player/Stop',
        $argument,
        ['\Handsmotion\StopResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Reset 恢复手臂至初始位置
     * @param \Handsmotion\ResetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Reset(\Handsmotion\ResetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Player/Reset',
        $argument,
        ['\Handsmotion\ResetResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * State 查询当前player状态
     * @param \Handsmotion\StateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function State(\Handsmotion\StateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Player/State',
        $argument,
        ['\Handsmotion\StateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * OnStateChange 监听当前player状态
     * @param \Handsmotion\OnStateChangeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function OnStateChange(\Handsmotion\OnStateChangeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/handsmotion.Player/OnStateChange',
        $argument,
        ['\Handsmotion\OnStateChangeResponse', 'decode'],
        $metadata, $options);
    }

}
