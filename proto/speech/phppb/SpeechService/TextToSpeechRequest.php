<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: speech.proto

namespace SpeechService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * Generated from protobuf message <code>speechService.TextToSpeechRequest</code>
 */
class TextToSpeechRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string text = 1;</code>
     */
    private $text = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $text
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Speech::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string text = 1;</code>
     * @return string
     */
    public function getText()
    {
        return $this->text;
    }

    /**
     * Generated from protobuf field <code>string text = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setText($var)
    {
        GPBUtil::checkString($var, True);
        $this->text = $var;

        return $this;
    }

}
