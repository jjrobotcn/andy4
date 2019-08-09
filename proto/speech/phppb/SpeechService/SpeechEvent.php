<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: speech.proto

namespace SpeechService;

use UnexpectedValueException;

/**
 * Protobuf type <code>speechService.SpeechEvent</code>
 */
class SpeechEvent
{
    /**
     * 零值
     *
     * Generated from protobuf enum <code>UNKNOWN_EVENT = 0;</code>
     */
    const UNKNOWN_EVENT = 0;
    /**
     * 唤醒
     *
     * Generated from protobuf enum <code>WAKE_UP = 1;</code>
     */
    const WAKE_UP = 1;
    /**
     * 休眠
     *
     * Generated from protobuf enum <code>HIBERNATE = 2;</code>
     */
    const HIBERNATE = 2;
    /**
     * 识别错误
     *
     * Generated from protobuf enum <code>ERROR = 3;</code>
     */
    const ERROR = 3;
    /**
     * Voice activity detection 语音活性检测
     *
     * Generated from protobuf enum <code>VAD = 4;</code>
     */
    const VAD = 4;
    /**
     * 识别结果
     *
     * Generated from protobuf enum <code>RESULT = 5;</code>
     */
    const RESULT = 5;
    /**
     * 文本转音频开始
     *
     * Generated from protobuf enum <code>TTS_START = 6;</code>
     */
    const TTS_START = 6;
    /**
     * 文本转音频结束
     *
     * Generated from protobuf enum <code>TTS_END = 7;</code>
     */
    const TTS_END = 7;

    private static $valueToName = [
        self::UNKNOWN_EVENT => 'UNKNOWN_EVENT',
        self::WAKE_UP => 'WAKE_UP',
        self::HIBERNATE => 'HIBERNATE',
        self::ERROR => 'ERROR',
        self::VAD => 'VAD',
        self::RESULT => 'RESULT',
        self::TTS_START => 'TTS_START',
        self::TTS_END => 'TTS_END',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}

