/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamCell;

import com.github.lgooddatepicker.optionalusertools.PickerUtilities;
import com.github.lgooddatepicker.optionalusertools.TimeVetoPolicy;
import java.time.LocalTime;

/**
 *
 * @author Tanay Thakar
 */
public class SampleTimeVetoPolicy implements TimeVetoPolicy 
{
    public boolean isTimeAllowed(LocalTime time) 
	{
            return PickerUtilities.isLocalTimeInRange(time, LocalTime.of(9, 00), LocalTime.of(19, 00), true);
        }
}
