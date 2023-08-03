package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1), //AGUARDADO PAGAMENTO 
	PAID(2), //PAGO
	SHIPPED(3), //ENVIADO
	DELIVERED(4), //ENTREGUE
	CANCELED(5); //CANCELADO
	
	private int code;
	
	private OrderStatus(int code) { //construtor em class enum é em private
		this.code= code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
