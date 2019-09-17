<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Kvstore;

/**
 */
class KVStoreClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * @param \Kvstore\PutRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Put(\Kvstore\PutRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/kvstore.KVStore/Put',
        $argument,
        ['\Kvstore\PutResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * @param \Kvstore\GetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Get(\Kvstore\GetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/kvstore.KVStore/Get',
        $argument,
        ['\Kvstore\GetResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * @param \Kvstore\GetPrefixRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetPrefix(\Kvstore\GetPrefixRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/kvstore.KVStore/GetPrefix',
        $argument,
        ['\Kvstore\GetPrefixResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
     * @param \Kvstore\GetPrefixStreamRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetPrefixStream(\Kvstore\GetPrefixStreamRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/kvstore.KVStore/GetPrefixStream',
        $argument,
        ['\Kvstore\GetPrefixStreamResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Delete 删除kv键值对
     * @param \Kvstore\DeleteRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Delete(\Kvstore\DeleteRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/kvstore.KVStore/Delete',
        $argument,
        ['\Kvstore\DeleteResponse', 'decode'],
        $metadata, $options);
    }

}
