// GENERATED CODE -- DO NOT EDIT!

// package: expressionService
// file: expression.proto

import * as expression_pb from "./expression_pb";
import * as grpc from "grpc";

interface IExpressionServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  playExpressions: grpc.MethodDefinition<expression_pb.PlayExpressionsRequest, expression_pb.PlayExpressionsResponse>;
  stopExpression: grpc.MethodDefinition<expression_pb.StopExpressionRequest, expression_pb.StopExpressionResponse>;
  uploadExpressionFile: grpc.MethodDefinition<expression_pb.UploadExpressionFileRequest, expression_pb.UploadExpressionFileResponse>;
  rename: grpc.MethodDefinition<expression_pb.RenameRequest, expression_pb.RenameResponse>;
  listExpressions: grpc.MethodDefinition<expression_pb.ListExpressionsRequest, expression_pb.ListExpressionsResponse>;
  deleteExpressions: grpc.MethodDefinition<expression_pb.DeleteExpressionsRequest, expression_pb.DeleteExpressionsResponse>;
  state: grpc.MethodDefinition<expression_pb.StateRequest, expression_pb.StateResponse>;
  switch: grpc.MethodDefinition<expression_pb.SwitchRequest, expression_pb.SwitchResponse>;
}

export const ExpressionServiceService: IExpressionServiceService;

export class ExpressionServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  playExpressions(argument: expression_pb.PlayExpressionsRequest, callback: grpc.requestCallback<expression_pb.PlayExpressionsResponse>): grpc.ClientUnaryCall;
  playExpressions(argument: expression_pb.PlayExpressionsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.PlayExpressionsResponse>): grpc.ClientUnaryCall;
  playExpressions(argument: expression_pb.PlayExpressionsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.PlayExpressionsResponse>): grpc.ClientUnaryCall;
  stopExpression(argument: expression_pb.StopExpressionRequest, callback: grpc.requestCallback<expression_pb.StopExpressionResponse>): grpc.ClientUnaryCall;
  stopExpression(argument: expression_pb.StopExpressionRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.StopExpressionResponse>): grpc.ClientUnaryCall;
  stopExpression(argument: expression_pb.StopExpressionRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.StopExpressionResponse>): grpc.ClientUnaryCall;
  uploadExpressionFile(argument: expression_pb.UploadExpressionFileRequest, callback: grpc.requestCallback<expression_pb.UploadExpressionFileResponse>): grpc.ClientUnaryCall;
  uploadExpressionFile(argument: expression_pb.UploadExpressionFileRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.UploadExpressionFileResponse>): grpc.ClientUnaryCall;
  uploadExpressionFile(argument: expression_pb.UploadExpressionFileRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.UploadExpressionFileResponse>): grpc.ClientUnaryCall;
  rename(argument: expression_pb.RenameRequest, callback: grpc.requestCallback<expression_pb.RenameResponse>): grpc.ClientUnaryCall;
  rename(argument: expression_pb.RenameRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.RenameResponse>): grpc.ClientUnaryCall;
  rename(argument: expression_pb.RenameRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.RenameResponse>): grpc.ClientUnaryCall;
  listExpressions(argument: expression_pb.ListExpressionsRequest, callback: grpc.requestCallback<expression_pb.ListExpressionsResponse>): grpc.ClientUnaryCall;
  listExpressions(argument: expression_pb.ListExpressionsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.ListExpressionsResponse>): grpc.ClientUnaryCall;
  listExpressions(argument: expression_pb.ListExpressionsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.ListExpressionsResponse>): grpc.ClientUnaryCall;
  deleteExpressions(argument: expression_pb.DeleteExpressionsRequest, callback: grpc.requestCallback<expression_pb.DeleteExpressionsResponse>): grpc.ClientUnaryCall;
  deleteExpressions(argument: expression_pb.DeleteExpressionsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.DeleteExpressionsResponse>): grpc.ClientUnaryCall;
  deleteExpressions(argument: expression_pb.DeleteExpressionsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.DeleteExpressionsResponse>): grpc.ClientUnaryCall;
  state(argument: expression_pb.StateRequest, callback: grpc.requestCallback<expression_pb.StateResponse>): grpc.ClientUnaryCall;
  state(argument: expression_pb.StateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.StateResponse>): grpc.ClientUnaryCall;
  state(argument: expression_pb.StateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.StateResponse>): grpc.ClientUnaryCall;
  switch(argument: expression_pb.SwitchRequest, callback: grpc.requestCallback<expression_pb.SwitchResponse>): grpc.ClientUnaryCall;
  switch(argument: expression_pb.SwitchRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.SwitchResponse>): grpc.ClientUnaryCall;
  switch(argument: expression_pb.SwitchRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<expression_pb.SwitchResponse>): grpc.ClientUnaryCall;
}
