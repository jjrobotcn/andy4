<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: expression.proto

namespace ExpressionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 表情重命名请求
 *
 * Generated from protobuf message <code>expressionService.RenameRequest</code>
 */
class RenameRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 表情id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     */
    private $id = '';
    /**
     * 新表情名
     *
     * Generated from protobuf field <code>string name = 2;</code>
     */
    private $name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *           表情id
     *     @type string $name
     *           新表情名
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Expression::initOnce();
        parent::__construct($data);
    }

    /**
     * 表情id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * 表情id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->id = $var;

        return $this;
    }

    /**
     * 新表情名
     *
     * Generated from protobuf field <code>string name = 2;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * 新表情名
     *
     * Generated from protobuf field <code>string name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

}
