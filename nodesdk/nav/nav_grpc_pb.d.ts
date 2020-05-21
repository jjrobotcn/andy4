// GENERATED CODE -- DO NOT EDIT!

// package: navService
// file: nav.proto

import * as nav_pb from "./nav_pb";
import * as grpc from "grpc";

interface INavControllerService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  move: grpc.MethodDefinition<nav_pb.MoveRequest, nav_pb.MoveResponse>;
  navTo: grpc.MethodDefinition<nav_pb.NavToRequest, nav_pb.NavToResponse>;
  navStop: grpc.MethodDefinition<nav_pb.NavStopRequest, nav_pb.NavStopResponse>;
  autoCharge: grpc.MethodDefinition<nav_pb.AutoChargeRequest, nav_pb.AutoChargeResponse>;
  rotate: grpc.MethodDefinition<nav_pb.RotateRequest, nav_pb.RotateResponse>;
  onNavEventChange: grpc.MethodDefinition<nav_pb.OnNavEventChangeRequest, nav_pb.OnNavEventChangeResponse>;
  newRoute: grpc.MethodDefinition<nav_pb.NewRouteRequest, nav_pb.NewRouteResponse>;
  listRoutes: grpc.MethodDefinition<nav_pb.ListRoutesRequest, nav_pb.ListRoutesResponse>;
  updateRoute: grpc.MethodDefinition<nav_pb.UpdateRouteRequest, nav_pb.UpdateRouteResponse>;
  deleteRoutes: grpc.MethodDefinition<nav_pb.DeleteRoutesRequest, nav_pb.DeleteRoutesResponse>;
}

export const NavControllerService: INavControllerService;

export class NavControllerClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  move(metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientDuplexStream<nav_pb.MoveRequest, nav_pb.MoveResponse>;
  move(metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientDuplexStream<nav_pb.MoveRequest, nav_pb.MoveResponse>;
  navTo(argument: nav_pb.NavToRequest, callback: grpc.requestCallback<nav_pb.NavToResponse>): grpc.ClientUnaryCall;
  navTo(argument: nav_pb.NavToRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.NavToResponse>): grpc.ClientUnaryCall;
  navTo(argument: nav_pb.NavToRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.NavToResponse>): grpc.ClientUnaryCall;
  navStop(argument: nav_pb.NavStopRequest, callback: grpc.requestCallback<nav_pb.NavStopResponse>): grpc.ClientUnaryCall;
  navStop(argument: nav_pb.NavStopRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.NavStopResponse>): grpc.ClientUnaryCall;
  navStop(argument: nav_pb.NavStopRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.NavStopResponse>): grpc.ClientUnaryCall;
  autoCharge(argument: nav_pb.AutoChargeRequest, callback: grpc.requestCallback<nav_pb.AutoChargeResponse>): grpc.ClientUnaryCall;
  autoCharge(argument: nav_pb.AutoChargeRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.AutoChargeResponse>): grpc.ClientUnaryCall;
  autoCharge(argument: nav_pb.AutoChargeRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.AutoChargeResponse>): grpc.ClientUnaryCall;
  rotate(argument: nav_pb.RotateRequest, callback: grpc.requestCallback<nav_pb.RotateResponse>): grpc.ClientUnaryCall;
  rotate(argument: nav_pb.RotateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.RotateResponse>): grpc.ClientUnaryCall;
  rotate(argument: nav_pb.RotateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.RotateResponse>): grpc.ClientUnaryCall;
  onNavEventChange(argument: nav_pb.OnNavEventChangeRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<nav_pb.OnNavEventChangeResponse>;
  onNavEventChange(argument: nav_pb.OnNavEventChangeRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<nav_pb.OnNavEventChangeResponse>;
  newRoute(argument: nav_pb.NewRouteRequest, callback: grpc.requestCallback<nav_pb.NewRouteResponse>): grpc.ClientUnaryCall;
  newRoute(argument: nav_pb.NewRouteRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.NewRouteResponse>): grpc.ClientUnaryCall;
  newRoute(argument: nav_pb.NewRouteRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.NewRouteResponse>): grpc.ClientUnaryCall;
  listRoutes(argument: nav_pb.ListRoutesRequest, callback: grpc.requestCallback<nav_pb.ListRoutesResponse>): grpc.ClientUnaryCall;
  listRoutes(argument: nav_pb.ListRoutesRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.ListRoutesResponse>): grpc.ClientUnaryCall;
  listRoutes(argument: nav_pb.ListRoutesRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.ListRoutesResponse>): grpc.ClientUnaryCall;
  updateRoute(argument: nav_pb.UpdateRouteRequest, callback: grpc.requestCallback<nav_pb.UpdateRouteResponse>): grpc.ClientUnaryCall;
  updateRoute(argument: nav_pb.UpdateRouteRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.UpdateRouteResponse>): grpc.ClientUnaryCall;
  updateRoute(argument: nav_pb.UpdateRouteRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.UpdateRouteResponse>): grpc.ClientUnaryCall;
  deleteRoutes(argument: nav_pb.DeleteRoutesRequest, callback: grpc.requestCallback<nav_pb.DeleteRoutesResponse>): grpc.ClientUnaryCall;
  deleteRoutes(argument: nav_pb.DeleteRoutesRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.DeleteRoutesResponse>): grpc.ClientUnaryCall;
  deleteRoutes(argument: nav_pb.DeleteRoutesRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<nav_pb.DeleteRoutesResponse>): grpc.ClientUnaryCall;
}
