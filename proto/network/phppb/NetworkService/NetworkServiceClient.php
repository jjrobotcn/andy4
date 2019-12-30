<?php
// GENERATED CODE -- DO NOT EDIT!

namespace NetworkService;

/**
 */
class NetworkServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * 获取网络扫描结果流
     * api请求时将触发ssid扫描更新，该方法在同一时刻多个请求仅处理一次，向所有监听返回同一扫描结果
     * 方法不主动进行更新，但监听用户可获取其它请求中返回的扫描结果
     * @param \NetworkService\ListNetworksRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListNetworks(\NetworkService\ListNetworksRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/networkService.NetworkService/ListNetworks',
        $argument,
        ['\NetworkService\ListNetworksResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 连接至指定网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * @param \NetworkService\ConnectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Connect(\NetworkService\ConnectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkService.NetworkService/Connect',
        $argument,
        ['\NetworkService\ConnectResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取连接状态流
     * 在连接开始时立即返回当前最新的扫描数据
     * 并持续在网络数据更新时接收新数据
     * @param \NetworkService\GetStatusRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetStatus(\NetworkService\GetStatusRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/networkService.NetworkService/GetStatus',
        $argument,
        ['\NetworkService\GetStatusResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 获取网络设备相关信息
     * v1.1.0
     * @param \NetworkService\GetNetworkDeviceInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetNetworkDeviceInfo(\NetworkService\GetNetworkDeviceInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkService.NetworkService/GetNetworkDeviceInfo',
        $argument,
        ['\NetworkService\GetNetworkDeviceInfoResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * 修改网络设备相关信息
     * v1.1.0
     * @param \NetworkService\UpdateNetworkDeviceInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateNetworkDeviceInfo(\NetworkService\UpdateNetworkDeviceInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkService.NetworkService/UpdateNetworkDeviceInfo',
        $argument,
        ['\NetworkService\UpdateNetworkDeviceInfoResponse', 'decode'],
        $metadata, $options);
    }

}
