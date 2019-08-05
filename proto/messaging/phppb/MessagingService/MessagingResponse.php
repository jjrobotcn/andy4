<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: messaging.proto

namespace MessagingService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * Generated from protobuf message <code>messagingService.MessagingResponse</code>
 */
class MessagingResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * 消息主题
     *
     * Generated from protobuf field <code>string topic = 1;</code>
     */
    private $topic = '';
    /**
     * 消息内容
     *
     * Generated from protobuf field <code>bytes payload = 2;</code>
     */
    private $payload = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $topic
     *           消息主题
     *     @type string $payload
     *           消息内容
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Messaging::initOnce();
        parent::__construct($data);
    }

    /**
     * 消息主题
     *
     * Generated from protobuf field <code>string topic = 1;</code>
     * @return string
     */
    public function getTopic()
    {
        return $this->topic;
    }

    /**
     * 消息主题
     *
     * Generated from protobuf field <code>string topic = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setTopic($var)
    {
        GPBUtil::checkString($var, True);
        $this->topic = $var;

        return $this;
    }

    /**
     * 消息内容
     *
     * Generated from protobuf field <code>bytes payload = 2;</code>
     * @return string
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * 消息内容
     *
     * Generated from protobuf field <code>bytes payload = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;

        return $this;
    }

}
