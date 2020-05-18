<?php
// GENERATED CODE -- DO NOT EDIT!

namespace EscposService;

/**
 */
class EscPosServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 打印bytes数据
     * 打印模板与打印对象方式不满足业务需求
     * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
     * 传入打印内容
     * @param \EscposService\PrintRawRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PrintRaw(\EscposService\PrintRawRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/PrintRaw',
        $argument,
        ['\EscposService\PrintRawResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 打印对象
     * @param \EscposService\PrintElementsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PrintElements(\EscposService\PrintElementsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/PrintElements',
        $argument,
        ['\EscposService\PrintElementsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 打印预设的html模板内容
     * @param \EscposService\PrintHtmlTemplateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PrintHtmlTemplate(\EscposService\PrintHtmlTemplateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/PrintHtmlTemplate',
        $argument,
        ['\EscposService\PrintHtmlTemplateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 创建html模板
     * @param \EscposService\NewHtmlTemplateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function NewHtmlTemplate(\EscposService\NewHtmlTemplateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/NewHtmlTemplate',
        $argument,
        ['\EscposService\NewHtmlTemplateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取html模板列表
     * @param \EscposService\ListHtmlTemplatesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListHtmlTemplates(\EscposService\ListHtmlTemplatesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/ListHtmlTemplates',
        $argument,
        ['\EscposService\ListHtmlTemplatesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取指定html模板内容
     * @param \EscposService\GetHtmlTemplateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetHtmlTemplate(\EscposService\GetHtmlTemplateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/GetHtmlTemplate',
        $argument,
        ['\EscposService\GetHtmlTemplateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 更新html模板
     * @param \EscposService\UpdateHtmlTemplateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateHtmlTemplate(\EscposService\UpdateHtmlTemplateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/UpdateHtmlTemplate',
        $argument,
        ['\EscposService\UpdateHtmlTemplateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 删除html模板
     * @param \EscposService\DeleteHtmlTemplatesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteHtmlTemplates(\EscposService\DeleteHtmlTemplatesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/escposService.EscPosService/DeleteHtmlTemplates',
        $argument,
        ['\EscposService\DeleteHtmlTemplatesResponse', 'decode'],
        $metadata, $options);
    }

}
