package com.guestpulse.GuestPulse.repository;

import com.guestpulse.GuestPulse.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}