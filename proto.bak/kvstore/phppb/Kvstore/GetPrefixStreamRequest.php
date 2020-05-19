<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kvstore.proto

namespace Kvstore;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>kvstore.GetPrefixStreamRequest</code>
 */
class GetPrefixStreamRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * keys: [not_match, match_1, match_2, match.3, match&#64;4]
     * match: [match_1, match_2, match.3, match&#64;4]
     * match_: [match_1,, match_2]
     * match&#64;: [match&#64;3]
     * match!: []
     *
     * Generated from protobuf field <code>string key_prefix = 1;</code>
     */
    private $key_prefix = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $key_prefix
     *           keys: [not_match, match_1, match_2, match.3, match&#64;4]
     *           match: [match_1, match_2, match.3, match&#64;4]
     *           match_: [match_1,, match_2]
     *           match&#64;: [match&#64;3]
     *           match!: []
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Kvstore::initOnce();
        parent::__construct($data);
    }

    /**
     * keys: [not_match, match_1, match_2, match.3, match&#64;4]
     * match: [match_1, match_2, match.3, match&#64;4]
     * match_: [match_1,, match_2]
     * match&#64;: [match&#64;3]
     * match!: []
     *
     * Generated from protobuf field <code>string key_prefix = 1;</code>
     * @return string
     */
    public function getKeyPrefix()
    {
        return $this->key_prefix;
    }

    /**
     * keys: [not_match, match_1, match_2, match.3, match&#64;4]
     * match: [match_1, match_2, match.3, match&#64;4]
     * match_: [match_1,, match_2]
     * match&#64;: [match&#64;3]
     * match!: []
     *
     * Generated from protobuf field <code>string key_prefix = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setKeyPrefix($var)
    {
        GPBUtil::checkString($var, True);
        $this->key_prefix = $var;

        return $this;
    }

}
