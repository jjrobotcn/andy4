<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

namespace GPBMetadata;

class Nav
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Annotations::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0ab5220a096e61762e70726f746f120a6e61765365727669636522680a0b" .
            "4d6f766552657175657374120d0a05737065656418012001280d120e0a06" .
            "72737065656418022001280d122c0a09646972656374696f6e1803200128" .
            "0e32192e6e6176536572766963652e4d6f7665446972656374696f6e120c" .
            "0a046d6f6465180420012809223b0a0c4d6f7665526573706f6e7365122b" .
            "0a0b7374617475735f636f646518012001280e32162e6e61765365727669" .
            "63652e537461747573436f646522280a094e6176546172676574120d0a05" .
            "696e646578180120012809120c0a046e616d651802200128092285010a0a" .
            "4e6176526f616d696e6712310a106e61765f726f616d696e675f74797065" .
            "18012001280e32172e6e6176536572766963652e526f616d696e67547970" .
            "6512100a08776169745f736563180220012805121e0a16726f616d696e67" .
            "5f7461726765745f696e646578657318032003280912120a0a6f72646572" .
            "5f6c6f6f701804200128082294010a0c4e6176546f526571756573741227" .
            "0a0674617267657418012001280b32152e6e6176536572766963652e4e61" .
            "76546172676574480012290a07726f616d696e6718032001280b32162e6e" .
            "6176536572766963652e4e6176526f616d696e674800120d0a0573706565" .
            "6418022001280d12110a0973796e635f6d6f6465180420012808420e0a0c" .
            "7461726765745f6f6e656f66228b010a0d4e6176546f526573706f6e7365" .
            "122b0a0b7374617475735f636f646518012001280e32162e6e6176536572" .
            "766963652e537461747573436f646512270a067461726765741802200128" .
            "0b32152e6e6176536572766963652e4e6176546172676574480012140a0a" .
            "69735f726f616d696e671803200128084800420e0a0c7461726765745f6f" .
            "6e656f6622100a0e4e617653746f7052657175657374223e0a0f4e617653" .
            "746f70526573706f6e7365122b0a0b7374617475735f636f646518012001" .
            "280e32162e6e6176536572766963652e537461747573436f6465227c0a11" .
            "4175746f4368617267655265717565737412100a06636861726765180120" .
            "012808480012100a0663616e63656c180220012808480012170a0d636861" .
            "7267655f707265736574180320012808480012130a0b74696d656f75745f" .
            "73656318042001280d42150a136368617267655f6f7074696f6e5f6f6e65" .
            "6f66224e0a124175746f436861726765526573706f6e736512380a126368" .
            "617267655f7374617475735f636f646518012001280e321c2e6e61765365" .
            "72766963652e436861726765537461747573436f646522440a0d526f7461" .
            "746552657175657374120f0a05616e676c65180120012805480012120a08" .
            "726f6c6c6261636b1802200128084800420e0a0c726f746174655f6f6e65" .
            "6f66223d0a0e526f74617465526573706f6e7365122b0a0b737461747573" .
            "5f636f646518012001280e32162e6e6176536572766963652e5374617475" .
            "73436f646522190a174f6e4e61764576656e744368616e67655265717565" .
            "737422380a094d6f76654576656e74122b0a0b7374617475735f636f6465" .
            "18012001280e32162e6e6176536572766963652e537461747573436f6465" .
            "22620a084e61764576656e74122b0a0b7374617475735f636f6465180120" .
            "01280e32162e6e6176536572766963652e537461747573436f646512290a" .
            "0a6e61765f74617267657418022001280b32152e6e617653657276696365" .
            "2e4e6176546172676574224b0a0f4175746f4368617267654576656e7412" .
            "380a126368617267655f7374617475735f636f646518012001280e321c2e" .
            "6e6176536572766963652e436861726765537461747573436f6465223a0a" .
            "0b526f746174654576656e74122b0a0b7374617475735f636f6465180120" .
            "01280e32162e6e6176536572766963652e537461747573436f6465229f02" .
            "0a184f6e4e61764576656e744368616e6765526573706f6e736512300a0e" .
            "6e61765f6576656e745f7479706518012001280e32182e6e617653657276" .
            "6963652e4e61764576656e7454797065122b0a0a6d6f76655f6576656e74" .
            "18022001280b32152e6e6176536572766963652e4d6f76654576656e7448" .
            "0012290a096e61765f6576656e7418032001280b32142e6e617653657276" .
            "6963652e4e61764576656e744800122f0a0c726f746174655f6576656e74" .
            "18042001280b32172e6e6176536572766963652e526f746174654576656e" .
            "74480012380a116175746f5f6368617267655f6576656e7418052001280b" .
            "321b2e6e6176536572766963652e4175746f4368617267654576656e7448" .
            "00420e0a0c6368616e67655f6f6e656f6622160a144c6f636174696f6e52" .
            "657365745265717565737422170a154c6f636174696f6e52657365745265" .
            "73706f6e736522620a05526f757465120a0a026964180120012809120c0a" .
            "046e616d6518022001280912110a0969735f616374697665180320012808" .
            "122c0a0c726f7574655f706f696e747318042003280b32162e6e61765365" .
            "72766963652e526f757465506f696e74222a0a0a526f757465506f696e74" .
            "120c0a046e616d65180120012809120e0a06726f7461746518022001280d" .
            "22330a0f4e6577526f7574655265717565737412200a05726f7574651801" .
            "2001280b32112e6e6176536572766963652e526f75746522340a104e6577" .
            "526f757465526573706f6e736512200a05726f75746518012001280b3211" .
            "2e6e6176536572766963652e526f75746522130a114c697374526f757465" .
            "735265717565737422370a124c697374526f75746573526573706f6e7365" .
            "12210a06726f7574657318012003280b32112e6e6176536572766963652e" .
            "526f757465221d0a0f476574526f75746552657175657374120a0a026964" .
            "18012001280922340a10476574526f757465526573706f6e736512200a05" .
            "726f75746518012001280b32112e6e6176536572766963652e526f757465" .
            "22360a12557064617465526f7574655265717565737412200a05726f7574" .
            "6518012001280b32112e6e6176536572766963652e526f75746522370a13" .
            "557064617465526f757465526573706f6e736512200a05726f7574651801" .
            "2001280b32112e6e6176536572766963652e526f75746522280a1344656c" .
            "657465526f757465735265717565737412110a09726f757465735f696418" .
            "012003280922160a1444656c657465526f75746573526573706f6e73652a" .
            "ee010a0a537461747573436f6465120b0a07554e4b4e4f574e1000120b0a" .
            "0753544f505045441001120a0a064d4f56494e471002120d0a0950524550" .
            "4152494e471003120a0a0643414e43454c1004120c0a0852454c45415345" .
            "44100512100a0c4552525f4f42535441434c45100a12110a0d4552525f4e" .
            "4f545f5245414459100b12120a0e4552525f4d4f544f525f4641494c100c" .
            "12140a104552525f57524f4e475f544152474554100d120e0a0a52454a5f" .
            "4d4f56494e471014120e0a0a52454a5f4e4156494e47101512100a0c5245" .
            "4a5f4348415247494e47101612100a0c52454a5f524f544154494e471017" .
            "2a98010a0d4d6f7665446972656374696f6e120b0a0752454c4541534510" .
            "00120b0a07464f52574152441001120c0a084241434b5741524410021208" .
            "0a044c454654100312090a055249474854100412100a0c4c4546545f464f" .
            "5257415244100512110a0d52494748545f464f5257415244100612110a0d" .
            "4c4546545f4241434b57415244100712120a0e52494748545f4241434b57" .
            "41524410082a590a0b526f616d696e675479706512190a15524f414d494e" .
            "475f545950455f434f4e54494e5545100012160a12524f414d494e475f54" .
            "5950455f4f52444552100112170a13524f414d494e475f545950455f5241" .
            "4e444f4d10022afa010a10436861726765537461747573436f646512190a" .
            "154348415247455f5354415455535f554e4b4e4f574e1000121b0a174348" .
            "415247455f5354415455535f505245504152494e471001121a0a16434841" .
            "5247455f5354415455535f52454c45415345441002121c0a184348415247" .
            "455f5354415455535f434f4e4e454354494e471003121a0a164348415247" .
            "455f5354415455535f4348415247494e471004121f0a1b4348415247455f" .
            "5354415455535f444953434f4e4e454354494e47100512170a1343484152" .
            "47455f434f4e4e4543545f4641494c1006121e0a1a4348415247455f5354" .
            "415455535f4e41565f4f42535441434c4510072a6e0a0c4e61764576656e" .
            "745479706512160a124e41565f4556454e545f5245564552534544100012" .
            "0e0a0a4d4f56455f4556454e541001120d0a094e41565f4556454e541002" .
            "12150a114155544f5f4348415247455f4556454e54100312100a0c524f54" .
            "4154455f4556454e54100432b6090a0d4e6176436f6e74726f6c6c657212" .
            "3f0a044d6f766512172e6e6176536572766963652e4d6f76655265717565" .
            "73741a182e6e6176536572766963652e4d6f7665526573706f6e73652200" .
            "28013001125b0a054e6176546f12182e6e6176536572766963652e4e6176" .
            "546f526571756573741a192e6e6176536572766963652e4e6176546f5265" .
            "73706f6e7365221d82d3e493021722122f6170692f76322f6e61762f6e61" .
            "765f746f3a012a12630a074e617653746f70121a2e6e6176536572766963" .
            "652e4e617653746f70526571756573741a1b2e6e6176536572766963652e" .
            "4e617653746f70526573706f6e7365221f82d3e493021922142f6170692f" .
            "76322f6e61762f6e61765f73746f703a012a126f0a0a4175746f43686172" .
            "6765121d2e6e6176536572766963652e4175746f43686172676552657175" .
            "6573741a1e2e6e6176536572766963652e4175746f436861726765526573" .
            "706f6e7365222282d3e493021c22172f6170692f76322f6e61762f617574" .
            "6f5f6368617267653a012a125e0a06526f7461746512192e6e6176536572" .
            "766963652e526f74617465526571756573741a1a2e6e6176536572766963" .
            "652e526f74617465526573706f6e7365221d82d3e493021722122f617069" .
            "2f76322f6e61762f726f746174653a012a128b010a104f6e4e6176457665" .
            "6e744368616e676512232e6e6176536572766963652e4f6e4e6176457665" .
            "6e744368616e6765526571756573741a242e6e6176536572766963652e4f" .
            "6e4e61764576656e744368616e6765526573706f6e7365222a82d3e49302" .
            "24221f2f6170692f76322f6e61762f6f6e5f6e61765f6576656e745f6368" .
            "616e67653a012a3001127b0a0d4c6f636174696f6e526573657412202e6e" .
            "6176536572766963652e4c6f636174696f6e526573657452657175657374" .
            "1a212e6e6176536572766963652e4c6f636174696f6e5265736574526573" .
            "706f6e7365222582d3e493021f221a2f6170692f76322f6e61762f6c6f63" .
            "6174696f6e5f72657365743a012a12670a084e6577526f757465121b2e6e" .
            "6176536572766963652e4e6577526f757465526571756573741a1c2e6e61" .
            "76536572766963652e4e6577526f757465526573706f6e7365222082d3e4" .
            "93021a22152f6170692f76322f6e61762f6e65775f726f7574653a012a12" .
            "6f0a0a4c697374526f75746573121d2e6e6176536572766963652e4c6973" .
            "74526f75746573526571756573741a1e2e6e6176536572766963652e4c69" .
            "7374526f75746573526573706f6e7365222282d3e493021c22172f617069" .
            "2f76322f6e61762f6c6973745f726f757465733a012a12730a0b55706461" .
            "7465526f757465121e2e6e6176536572766963652e557064617465526f75" .
            "7465526571756573741a1f2e6e6176536572766963652e55706461746552" .
            "6f757465526573706f6e7365222382d3e493021d22182f6170692f76322f" .
            "6e61762f7570646174655f726f7574653a012a12770a0c44656c65746552" .
            "6f75746573121f2e6e6176536572766963652e44656c657465526f757465" .
            "73526571756573741a202e6e6176536572766963652e44656c657465526f" .
            "75746573526573706f6e7365222482d3e493021e22192f6170692f76322f" .
            "6e61762f64656c6574655f726f757465733a012a620670726f746f33"
        ), true);

        static::$is_initialized = true;
    }
}
