<?php
// GENERATED CODE -- DO NOT EDIT!

namespace NavService;

/**
 */
class NavControllerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 遥控移动
     * 当机器人处于非空闲及遥控移动状态时， 当前链接将被强制关闭, 错误描述为: "[naving|charging|rotating] reject"
     * 当机器人处于 *其它用户* 的遥控移动状态时， *你* 将收到MoveStatusResponse状态码REJ_MOVING
     * 当机器人处于 *你* 的遥控移动状态时, 请在500ms内持续发送遥控指令， 超时将自动停止移动
     * 当机器人处于 *你* 的遥控移动状态时, 若5秒后无遥控指令的更新, *你* 将接收到MoveStatusResponse状态码RELEASED，
     * 此时遥控移动控制权交由抢占的 *其它用户* 或其它类型目标的操作
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Move($metadata = [], $options = []) {
        return $this->_bidiRequest('/navService.NavController/Move',
        ['\NavService\MoveResponse','decode'],
        $metadata, $options);
    }

    /**
     * 导航
     * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
     * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
     * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
     * @param \NavService\NavToRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NavTo(\NavService\NavToRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/NavTo',
        $argument,
        ['\NavService\NavToResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 停止
     * 静止: 立即返回STOPPED
     * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
     * 其它: 错误描述为: "[moving|charging] reject"
     * @param \NavService\NavStopRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NavStop(\NavService\NavStopRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/NavStop',
        $argument,
        ['\NavService\NavStopResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 自动充电
     * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
     * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
     * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
     * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
     * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
     * @param \NavService\AutoChargeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function AutoCharge(\NavService\AutoChargeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/AutoCharge',
        $argument,
        ['\NavService\AutoChargeResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 原地旋转
     * 当旋转完成后返回STOPPED
     * 当用户使用NavStop中止时将返回CANCEL
     * 若超时30秒未执行完毕将返回超时错误
     * @param \NavService\RotateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Rotate(\NavService\RotateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/Rotate',
        $argument,
        ['\NavService\RotateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 导航事件监听
     * 监听导航模块中各类事件的变动更新
     * @param \NavService\OnNavEventChangeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function OnNavEventChange(\NavService\OnNavEventChangeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/navService.NavController/OnNavEventChange',
        $argument,
        ['\NavService\OnNavEventChangeResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * >=2.2.0
     * 重置当前定位
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认3s，仅在非错误状态下重置
     * *目前仅支持无线导航版本，磁导航版本中将直接返回成功状态
     * @param \NavService\LocationResetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function LocationReset(\NavService\LocationResetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/LocationReset',
        $argument,
        ['\NavService\LocationResetResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 新建线路
     * @param \NavService\NewRouteRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NewRoute(\NavService\NewRouteRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/NewRoute',
        $argument,
        ['\NavService\NewRouteResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取线路
     * @param \NavService\ListRoutesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListRoutes(\NavService\ListRoutesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/ListRoutes',
        $argument,
        ['\NavService\ListRoutesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 更新线路信息
     * @param \NavService\UpdateRouteRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateRoute(\NavService\UpdateRouteRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/UpdateRoute',
        $argument,
        ['\NavService\UpdateRouteResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 删除线路
     * @param \NavService\DeleteRoutesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteRoutes(\NavService\DeleteRoutesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/navService.NavController/DeleteRoutes',
        $argument,
        ['\NavService\DeleteRoutesResponse', 'decode'],
        $metadata, $options);
    }

}
