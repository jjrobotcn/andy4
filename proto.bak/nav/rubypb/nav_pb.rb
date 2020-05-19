# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
require 'map_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("nav.proto", :syntax => :proto3) do
    add_message "navService.MoveRequest" do
      optional :speed, :uint32, 1
      optional :rspeed, :uint32, 2
      optional :direction, :enum, 3, "navService.MoveDirection"
      optional :mode, :string, 4
    end
    add_message "navService.MoveResponse" do
      optional :status_code, :enum, 1, "navService.StatusCode"
    end
    add_message "navService.NavTarget" do
      optional :index, :string, 1
      optional :name, :string, 2
    end
    add_message "navService.NavRoaming" do
      optional :nav_roaming_type, :enum, 1, "navService.RoamingType"
      optional :wait_sec, :int32, 2
      repeated :roaming_target_indexes, :string, 3
      optional :order_loop, :bool, 4
    end
    add_message "navService.NavToRequest" do
      optional :speed, :uint32, 2
      optional :sync_mode, :bool, 4
      oneof :target_oneof do
        optional :target, :message, 1, "navService.NavTarget"
        optional :roaming, :message, 3, "navService.NavRoaming"
        optional :map_position, :message, 5, "navService.MapPosition"
      end
    end
    add_message "navService.NavToResponse" do
      optional :status_code, :enum, 1, "navService.StatusCode"
      oneof :target_oneof do
        optional :target, :message, 2, "navService.NavTarget"
        optional :is_roaming, :bool, 3
        optional :map_position, :message, 4, "navService.MapPosition"
      end
    end
    add_message "navService.NavStopRequest" do
    end
    add_message "navService.NavStopResponse" do
      optional :status_code, :enum, 1, "navService.StatusCode"
    end
    add_message "navService.AutoChargeRequest" do
      optional :timeout_sec, :uint32, 4
      oneof :charge_option_oneof do
        optional :charge, :bool, 1
        optional :cancel, :bool, 2
        optional :charge_preset, :bool, 3
      end
    end
    add_message "navService.AutoChargeResponse" do
      optional :charge_status_code, :enum, 1, "navService.ChargeStatusCode"
    end
    add_message "navService.RotateRequest" do
      oneof :rotate_oneof do
        optional :angle, :int32, 1
        optional :rollback, :bool, 2
      end
    end
    add_message "navService.RotateResponse" do
      optional :status_code, :enum, 1, "navService.StatusCode"
    end
    add_message "navService.OnNavEventChangeRequest" do
    end
    add_message "navService.MoveEvent" do
      optional :status_code, :enum, 1, "navService.StatusCode"
    end
    add_message "navService.NavEvent" do
      optional :status_code, :enum, 1, "navService.StatusCode"
      optional :nav_target, :message, 2, "navService.NavTarget"
    end
    add_message "navService.AutoChargeEvent" do
      optional :charge_status_code, :enum, 1, "navService.ChargeStatusCode"
    end
    add_message "navService.RotateEvent" do
      optional :status_code, :enum, 1, "navService.StatusCode"
    end
    add_message "navService.OnNavEventChangeResponse" do
      optional :nav_event_type, :enum, 1, "navService.NavEventType"
      oneof :change_oneof do
        optional :move_event, :message, 2, "navService.MoveEvent"
        optional :nav_event, :message, 3, "navService.NavEvent"
        optional :rotate_event, :message, 4, "navService.RotateEvent"
        optional :auto_charge_event, :message, 5, "navService.AutoChargeEvent"
      end
    end
    add_message "navService.Route" do
      optional :id, :string, 1
      optional :name, :string, 2
      optional :is_active, :bool, 3
      repeated :route_points, :message, 4, "navService.RoutePoint"
    end
    add_message "navService.RoutePoint" do
      optional :name, :string, 1
      optional :rotate, :uint32, 2
    end
    add_message "navService.NewRouteRequest" do
      optional :route, :message, 1, "navService.Route"
    end
    add_message "navService.NewRouteResponse" do
      optional :route, :message, 1, "navService.Route"
    end
    add_message "navService.ListRoutesRequest" do
    end
    add_message "navService.ListRoutesResponse" do
      repeated :routes, :message, 1, "navService.Route"
    end
    add_message "navService.GetRouteRequest" do
      optional :id, :string, 1
    end
    add_message "navService.GetRouteResponse" do
      optional :route, :message, 1, "navService.Route"
    end
    add_message "navService.UpdateRouteRequest" do
      optional :route, :message, 1, "navService.Route"
    end
    add_message "navService.UpdateRouteResponse" do
      optional :route, :message, 1, "navService.Route"
    end
    add_message "navService.DeleteRoutesRequest" do
      repeated :routes_id, :string, 1
    end
    add_message "navService.DeleteRoutesResponse" do
    end
    add_enum "navService.StatusCode" do
      value :UNKNOWN, 0
      value :STOPPED, 1
      value :MOVING, 2
      value :PREPARING, 3
      value :CANCEL, 4
      value :RELEASED, 5
      value :ERR_OBSTACLE, 10
      value :ERR_NOT_READY, 11
      value :ERR_MOTOR_FAIL, 12
      value :ERR_WRONG_TARGET, 13
      value :REJ_MOVING, 20
      value :REJ_NAVING, 21
      value :REJ_CHARGING, 22
      value :REJ_ROTATING, 23
    end
    add_enum "navService.MoveDirection" do
      value :RELEASE, 0
      value :FORWARD, 1
      value :BACKWARD, 2
      value :LEFT, 3
      value :RIGHT, 4
      value :LEFT_FORWARD, 5
      value :RIGHT_FORWARD, 6
      value :LEFT_BACKWARD, 7
      value :RIGHT_BACKWARD, 8
    end
    add_enum "navService.RoamingType" do
      value :ROAMING_TYPE_CONTINUE, 0
      value :ROAMING_TYPE_ORDER, 1
      value :ROAMING_TYPE_RANDOM, 2
    end
    add_enum "navService.ChargeStatusCode" do
      value :CHARGE_STATUS_UNKNOWN, 0
      value :CHARGE_STATUS_PREPARING, 1
      value :CHARGE_STATUS_RELEASED, 2
      value :CHARGE_STATUS_CONNECTING, 3
      value :CHARGE_STATUS_CHARGING, 4
      value :CHARGE_STATUS_DISCONNECTING, 5
      value :CHARGE_CONNECT_FAIL, 6
      value :CHARGE_STATUS_NAV_OBSTACLE, 7
    end
    add_enum "navService.NavEventType" do
      value :NAV_EVENT_REVERSED, 0
      value :MOVE_EVENT, 1
      value :NAV_EVENT, 2
      value :AUTO_CHARGE_EVENT, 3
      value :ROTATE_EVENT, 4
    end
  end
end

module NavService
  MoveRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.MoveRequest").msgclass
  MoveResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.MoveResponse").msgclass
  NavTarget = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavTarget").msgclass
  NavRoaming = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavRoaming").msgclass
  NavToRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavToRequest").msgclass
  NavToResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavToResponse").msgclass
  NavStopRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavStopRequest").msgclass
  NavStopResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavStopResponse").msgclass
  AutoChargeRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.AutoChargeRequest").msgclass
  AutoChargeResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.AutoChargeResponse").msgclass
  RotateRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.RotateRequest").msgclass
  RotateResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.RotateResponse").msgclass
  OnNavEventChangeRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.OnNavEventChangeRequest").msgclass
  MoveEvent = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.MoveEvent").msgclass
  NavEvent = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavEvent").msgclass
  AutoChargeEvent = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.AutoChargeEvent").msgclass
  RotateEvent = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.RotateEvent").msgclass
  OnNavEventChangeResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.OnNavEventChangeResponse").msgclass
  Route = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.Route").msgclass
  RoutePoint = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.RoutePoint").msgclass
  NewRouteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NewRouteRequest").msgclass
  NewRouteResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NewRouteResponse").msgclass
  ListRoutesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.ListRoutesRequest").msgclass
  ListRoutesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.ListRoutesResponse").msgclass
  GetRouteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.GetRouteRequest").msgclass
  GetRouteResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.GetRouteResponse").msgclass
  UpdateRouteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.UpdateRouteRequest").msgclass
  UpdateRouteResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.UpdateRouteResponse").msgclass
  DeleteRoutesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.DeleteRoutesRequest").msgclass
  DeleteRoutesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.DeleteRoutesResponse").msgclass
  StatusCode = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.StatusCode").enummodule
  MoveDirection = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.MoveDirection").enummodule
  RoamingType = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.RoamingType").enummodule
  ChargeStatusCode = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.ChargeStatusCode").enummodule
  NavEventType = Google::Protobuf::DescriptorPool.generated_pool.lookup("navService.NavEventType").enummodule
end