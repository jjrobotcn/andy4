<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kvstore.proto

namespace Kvstore;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>kvstore.DeleteRequest</code>
 */
class DeleteRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes key = 1;</code>
     */
    private $key = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $key
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Kvstore::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes key = 1;</code>
     * @return string
     */
    public function getKey()
    {
        return $this->key;
    }

    /**
     * Generated from protobuf field <code>bytes key = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->key = $var;

        return $this;
    }

}

