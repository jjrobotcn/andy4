<?php
// GENERATED CODE -- DO NOT EDIT!

namespace ExpressionService;

/**
 */
class ExpressionServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 播放表情
     * @param \ExpressionService\PlayExpressionsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PlayExpressions(\ExpressionService\PlayExpressionsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/PlayExpressions',
        $argument,
        ['\ExpressionService\PlayExpressionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 停止表情
     * @param \ExpressionService\StopExpressionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function StopExpression(\ExpressionService\StopExpressionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/StopExpression',
        $argument,
        ['\ExpressionService\StopExpressionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 上传表情
     * @param \ExpressionService\UploadExpressionFileRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UploadExpressionFile(\ExpressionService\UploadExpressionFileRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/UploadExpressionFile',
        $argument,
        ['\ExpressionService\UploadExpressionFileResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 表情重命名
     * >= v1.1.0
     * @param \ExpressionService\RenameRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Rename(\ExpressionService\RenameRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/Rename',
        $argument,
        ['\ExpressionService\RenameResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取表情数据
     * @param \ExpressionService\ListExpressionsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListExpressions(\ExpressionService\ListExpressionsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/ListExpressions',
        $argument,
        ['\ExpressionService\ListExpressionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 删除表情
     * @param \ExpressionService\DeleteExpressionsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteExpressions(\ExpressionService\DeleteExpressionsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/DeleteExpressions',
        $argument,
        ['\ExpressionService\DeleteExpressionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取当前表情模块状态
     * @param \ExpressionService\StateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function State(\ExpressionService\StateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/State',
        $argument,
        ['\ExpressionService\StateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 控制表情的开关
     * 关闭时表现为黑屏
     * @param \ExpressionService\SwitchRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Switch(\ExpressionService\SwitchRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/expressionService.ExpressionService/Switch',
        $argument,
        ['\ExpressionService\SwitchResponse', 'decode'],
        $metadata, $options);
    }

}
