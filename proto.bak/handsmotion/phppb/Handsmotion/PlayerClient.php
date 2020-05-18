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
     * Play为播放动作组对象方法
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
     * Stop为停止动作组对象方法
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
     * Reset为重置初始状态方法
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
     * Playlist为获取动作组对象列表方法
     * @param \Handsmotion\PlaylistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Playlist(\Handsmotion\PlaylistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handsmotion.Player/Playlist',
        $argument,
        ['\Handsmotion\PlaylistResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * State为查询当前player状态方法
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
     * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
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
