<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: capability.proto

namespace GPBMetadata;

class Capability
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Annotations::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0ac00d0a106361706162696c6974792e70726f746f120b68616e64736d6f" .
            "74696f6e22ba020a1846696e6765727341646a7573746d656e7452657175" .
            "65737412100a0868616e645f69647818012001280d120f0a057265736574" .
            "180220012808480012400a046d6f766518032001280b32302e68616e6473" .
            "6d6f74696f6e2e46696e6765727341646a7573746d656e74526571756573" .
            "742e46696e6765724d6f766548001ab1010a0a46696e6765724d6f766512" .
            "120a0a66696e6765725f69647818022001280d12520a0474797065180320" .
            "01280e32442e68616e64736d6f74696f6e2e46696e6765727341646a7573" .
            "746d656e74526571756573742e46696e6765724d6f76652e46696e676572" .
            "4d6f76656d656e745479706573120e0a067374726f6b6518042001280522" .
            "2b0a1346696e6765724d6f76656d656e74547970657312090a054c4f4f53" .
            "45100012090a055449474854100142050a03726571221b0a1946696e6765" .
            "727341646a7573746d656e74526573706f6e736522560a1441726d41646a" .
            "7573746d656e745265717565737412100a0868616e645f69647818012001" .
            "280d120f0a057265736574180220012808480012140a0a6469736162696c" .
            "697479180320012808480042050a0372657122170a1541726d41646a7573" .
            "746d656e74526573706f6e736522180a08506f736974696f6e120c0a0464" .
            "61746118012001280c221f0a1d4d61726b41734f726967696e616c506f73" .
            "6974696f6e5265717565737422200a1e4d61726b41734f726967696e616c" .
            "506f736974696f6e526573706f6e7365225e0a0e4d6f76656d656e745363" .
            "7269707412270a08706f736974696f6e18012001280b32152e68616e6473" .
            "6d6f74696f6e2e506f736974696f6e12100a0872756e5f74696d65180220" .
            "01280512110a096b6565705f74696d65180320012805221c0a1a47657441" .
            "62736f6c757465506f736974696f6e5265717565737422460a1b47657441" .
            "62736f6c757465506f736974696f6e526573706f6e736512270a08706f73" .
            "6974696f6e18012001280b32152e68616e64736d6f74696f6e2e506f7369" .
            "74696f6e22560a134162736f6c7574654d6f766552657175657374122c0a" .
            "077363726970747318012003280b321b2e68616e64736d6f74696f6e2e4d" .
            "6f76656d656e7453637269707412110a0973796e635f6d6f646518022001" .
            "280822160a144162736f6c7574654d6f7665526573706f6e736532b8060a" .
            "0a4361706162696c69747912a1010a1146696e6765727341646a7573746d" .
            "656e7412252e68616e64736d6f74696f6e2e46696e6765727341646a7573" .
            "746d656e74526571756573741a262e68616e64736d6f74696f6e2e46696e" .
            "6765727341646a7573746d656e74526573706f6e7365223d82d3e4930237" .
            "22322f6170692f76322f6d6f74696f6e2f68616e64732f6361706162696c" .
            "6974792f66696e676572735f61646a7573746d656e743a012a1291010a0d" .
            "41726d41646a7573746d656e7412212e68616e64736d6f74696f6e2e4172" .
            "6d41646a7573746d656e74526571756573741a222e68616e64736d6f7469" .
            "6f6e2e41726d41646a7573746d656e74526573706f6e7365223982d3e493" .
            "0233222e2f6170692f76322f6d6f74696f6e2f68616e64732f6361706162" .
            "696c6974792f61726d5f61646a7573746d656e743a012a12b7010a164d61" .
            "726b41734f726967696e616c506f736974696f6e122a2e68616e64736d6f" .
            "74696f6e2e4d61726b41734f726967696e616c506f736974696f6e526571" .
            "756573741a2b2e68616e64736d6f74696f6e2e4d61726b41734f72696769" .
            "6e616c506f736974696f6e526573706f6e7365224482d3e493023e22392f" .
            "6170692f76322f6d6f74696f6e2f68616e64732f6361706162696c697479" .
            "2f6d61726b5f61735f6f726967696e616c5f706f736974696f6e3a012a12" .
            "a7010a134765744162736f6c757465506f736974696f6e12272e68616e64" .
            "736d6f74696f6e2e4765744162736f6c757465506f736974696f6e526571" .
            "756573741a282e68616e64736d6f74696f6e2e4765744162736f6c757465" .
            "506f736974696f6e526573706f6e7365223d82d3e493023712352f617069" .
            "2f76322f6d6f74696f6e2f68616e64732f6361706162696c6974792f6765" .
            "745f6162736f6c7574655f706f736974696f6e128d010a0c4162736f6c75" .
            "74654d6f766512202e68616e64736d6f74696f6e2e4162736f6c7574654d" .
            "6f7665526571756573741a212e68616e64736d6f74696f6e2e4162736f6c" .
            "7574654d6f7665526573706f6e7365223882d3e4930232222d2f6170692f" .
            "76322f6d6f74696f6e2f68616e64732f6361706162696c6974792f616273" .
            "6f6c7574655f6d6f76653a012a620670726f746f33"
        ), true);

        static::$is_initialized = true;
    }
}

