<?php
// GENERATED CODE -- DO NOT EDIT!

namespace SpeechService;

/**
 */
class SpeechServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
     * ListenSpeechEventRequest中可配置相关状态消息过滤,
     * @param \SpeechService\ListenSpeechEventRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListenSpeechEvent(\SpeechService\ListenSpeechEventRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/speechService.SpeechService/ListenSpeechEvent',
        $argument,
        ['\SpeechService\ListenSpeechEventResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
     * @param \SpeechService\TextToSpeechRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function TextToSpeech(\SpeechService\TextToSpeechRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/speechService.SpeechService/TextToSpeech',
        $argument,
        ['\SpeechService\TextToSpeechResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * SpeechStop方法实现打断语音功能
     * @param \SpeechService\SpeechStopRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SpeechStop(\SpeechService\SpeechStopRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/speechService.SpeechService/SpeechStop',
        $argument,
        ['\SpeechService\SpeechStopResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 唤醒
     * @param \SpeechService\WakeUpRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function WakeUp(\SpeechService\WakeUpRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/speechService.SpeechService/WakeUp',
        $argument,
        ['\SpeechService\WakeUpResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 休眠
     * @param \SpeechService\HibernateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Hibernate(\SpeechService\HibernateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/speechService.SpeechService/Hibernate',
        $argument,
        ['\SpeechService\HibernateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 设置语音音量
     * v2.1.0
     * @param \SpeechService\SetVoiceVolumeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SetVoiceVolume(\SpeechService\SetVoiceVolumeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/speechService.SpeechService/SetVoiceVolume',
        $argument,
        ['\SpeechService\SetVoiceVolumeResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 查询语音音量
     * v2.1.0
     * @param \SpeechService\GetVoiceVolumeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetVoiceVolume(\SpeechService\GetVoiceVolumeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/speechService.SpeechService/GetVoiceVolume',
        $argument,
        ['\SpeechService\GetVoiceVolumeResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 配置参数(当前仅支持AIUI模块)
     * v2.1.0
     * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 => AIUI SDK => 参数配置)
     * @param \SpeechService\SetParamsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SetParams(\SpeechService\SetParamsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/speechService.SpeechService/SetParams',
        $argument,
        ['\SpeechService\SetParamsResponse', 'decode'],
        $metadata, $options);
    }

}
