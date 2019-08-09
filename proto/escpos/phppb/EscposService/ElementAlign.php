<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: escpos.proto

namespace EscposService;

use UnexpectedValueException;

/**
 * 行对齐方式
 *
 * Protobuf type <code>escposService.ElementAlign</code>
 */
class ElementAlign
{
    /**
     * 左对齐
     *
     * Generated from protobuf enum <code>LEFT = 0;</code>
     */
    const LEFT = 0;
    /**
     * 居中
     *
     * Generated from protobuf enum <code>CENTER = 1;</code>
     */
    const CENTER = 1;
    /**
     * 右对齐
     *
     * Generated from protobuf enum <code>RIGHT = 2;</code>
     */
    const RIGHT = 2;

    private static $valueToName = [
        self::LEFT => 'LEFT',
        self::CENTER => 'CENTER',
        self::RIGHT => 'RIGHT',
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
