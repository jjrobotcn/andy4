<?php
// GENERATED CODE -- DO NOT EDIT!

namespace XcScannerService;

/**
 */
class XCodeScannerServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \XcScannerService\GetScanDataRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetScanData(\XcScannerService\GetScanDataRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/xcScannerService.XCodeScannerService/GetScanData',
        $argument,
        ['\XcScannerService\GetScanDataResponse', 'decode'],
        $metadata, $options);
    }

}
