<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: headmotion.proto

namespace MotionService;

use UnexpectedValueException;

/**
 * 功能类型
 *
 * Protobuf type <code>motionService.MotionType</code>
 */
class MotionType
{
    /**
     * 保留
     *
     * Generated from protobuf enum <code>UNKNOWN_MOTION_TYPE = 0;</code>
     */
    const UNKNOWN_MOTION_TYPE = 0;
    /**
     * 头部
     *
     * Generated from protobuf enum <code>HEAD = 1;</code>
     */
    const HEAD = 1;

    private static $valueToName = [
        self::UNKNOWN_MOTION_TYPE => 'UNKNOWN_MOTION_TYPE',
        self::HEAD => 'HEAD',
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
