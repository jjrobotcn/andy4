<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: messaging.proto

namespace Messaging;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 消息类型
 *
 * Generated from protobuf message <code>messaging.MessagePublish</code>
 */
class MessagePublish extends \Google\Protobuf\Internal\Message
{
    /**
     * 数据发布的主题列表
     *
     * Generated from protobuf field <code>repeated string topics = 1;</code>
     */
    private $topics;
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
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $topics
     *           数据发布的主题列表
     *     @type string $payload
     *           消息内容
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Messaging::initOnce();
        parent::__construct($data);
    }

    /**
     * 数据发布的主题列表
     *
     * Generated from protobuf field <code>repeated string topics = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTopics()
    {
        return $this->topics;
    }

    /**
     * 数据发布的主题列表
     *
     * Generated from protobuf field <code>repeated string topics = 1;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setTopics($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->topics = $arr;

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
