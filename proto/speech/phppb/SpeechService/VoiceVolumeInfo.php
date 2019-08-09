<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: speech.proto

namespace SpeechService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 音量信息
 *
 * Generated from protobuf message <code>speechService.VoiceVolumeInfo</code>
 */
class VoiceVolumeInfo extends \Google\Protobuf\Internal\Message
{
    /**
     * 音量值 0-10
     * aiui模块硬件限制值: 2-10
     *
     * Generated from protobuf field <code>uint32 vol = 1;</code>
     */
    private $vol = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $vol
     *           音量值 0-10
     *           aiui模块硬件限制值: 2-10
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Speech::initOnce();
        parent::__construct($data);
    }

    /**
     * 音量值 0-10
     * aiui模块硬件限制值: 2-10
     *
     * Generated from protobuf field <code>uint32 vol = 1;</code>
     * @return int
     */
    public function getVol()
    {
        return $this->vol;
    }

    /**
     * 音量值 0-10
     * aiui模块硬件限制值: 2-10
     *
     * Generated from protobuf field <code>uint32 vol = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setVol($var)
    {
        GPBUtil::checkUint32($var);
        $this->vol = $var;

        return $this;
    }

}

