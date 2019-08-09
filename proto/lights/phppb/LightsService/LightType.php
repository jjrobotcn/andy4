<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lights.proto

namespace LightsService;

use UnexpectedValueException;

/**
 * 灯光类型
 *
 * Protobuf type <code>lightsService.LightType</code>
 */
class LightType
{
    /**
     * 保留， 不使用
     *
     * Generated from protobuf enum <code>UNDEFINED = 0;</code>
     */
    const UNDEFINED = 0;
    /**
     * 嘴部灯光
     *
     * Generated from protobuf enum <code>MOUTH = 1;</code>
     */
    const MOUTH = 1;
    /**
     * 手臂灯光
     *
     * Generated from protobuf enum <code>HANDS = 2;</code>
     */
    const HANDS = 2;
    /**
     * 耳朵灯光
     *
     * Generated from protobuf enum <code>EARS = 3;</code>
     */
    const EARS = 3;

    private static $valueToName = [
        self::UNDEFINED => 'UNDEFINED',
        self::MOUTH => 'MOUTH',
        self::HANDS => 'HANDS',
        self::EARS => 'EARS',
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

